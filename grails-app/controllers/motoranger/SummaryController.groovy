package motoranger

import java.util.Calendar
import grails.plugin.springsecurity.annotation.Secured
class SummaryController {

    def springSecurityService

	@Secured(['ROLE_OPERATOR', 'ROLE_MANERGER'])
    def unreceiveMoneyList(){

        def currentUser = springSecurityService.currentUser

        def query = Event.where{
            store == currentUser.store
        	totalPrice!=receivedMoney
        }

        def results = query.list(sort:"date", order:"desc")

        [events:results]

    }

    @Secured(['ROLE_ADMIN'])
    def turnoverYearList(){
        def currentUser = springSecurityService.currentUser
    	def thisYear=(new Date()).getAt(Calendar.YEAR)
    	def years=thisYear..thisYear-2

    	def resultList=[]


    	years.each(){

    		params.year=it
            def query = Event.where {
    		    year(date) == params.year
                store == currentUser.store

    		}

            def results = query.list()
            def totalMoney = results.totalPrice.sum()



            def costsList=[]
            results.details.part.cost.each{
                costsList += it
            }
            def totalCost = costsList.sum()


            query = StoreCostDetail.where {
                year(date) == params.year
                store == currentUser.store

            }

            results = query.list()
            def totalStoreCost = results.cost.sum() ?: 0


            def record=[
                year:it
                , totalMoney: totalMoney
                , totalCost: totalCost
                , totalStoreCost: totalStoreCost
            ]
            if(record.totalMoney)
                resultList << record

    	}


    	[resultList:resultList]

    }

    @Secured(['ROLE_ADMIN'])
    def turnoverMonthList(){

        def currentUser = springSecurityService.currentUser
    	def thisYear=params.year
    	def months=0..11

    	def resultList=[]


    	months.each(){

        	params.month=it
        	def query = Event.where {
    		    year(date) == params.year
    		    month(date) == params.month
                store == currentUser.store
    		}

            def results = query.list()
            def totalMoney = results.totalPrice.sum()

            def costsList=[]
            results.details.part.cost.each{
                costsList += it
            }
            def totalCost = costsList.sum()

            query = StoreCostDetail.where {
                year(date) == params.year
                month(date) == params.month
                store == currentUser.store
            }

            results = query.list()
            def totalStoreCost = results.cost.sum() ?: 0



            def record=[
                year:params.year
                , month: it
                , totalMoney: totalMoney
                , totalCost: totalCost
                , totalStoreCost: totalStoreCost
            ]

            if(record.totalMoney)
            	resultList << record

    	}


    	[resultList:resultList]

    }


}
