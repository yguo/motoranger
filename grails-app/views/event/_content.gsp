



<table class="table">
  <tbody>


    <tr>
        <td class="small"><g:message code="event.mileage.label" /></td>
        <td class="bold">${event.mileage}</td>
    </tr> 

    <g:if test = "${actionName != 'pickPartAddDetail'}">


      <tr>
          <td class="small">已收</td>
          <td class="bold">${event?.receivedMoney.toString()}</td>
      </tr> 
      <tr>
          <td class="small">未收</td>
          <td class="bold">${event?.totalPrice-event?.receivedMoney}</td>
      </tr> 
    </g:if>

    
    <tr>
      <td class="small"><g:message code="event.totalPrice.label" /></td>
      <td class="bold">${event?.totalPrice}</td>
    </tr>
    <tr>
        <td class="small"><g:message code="default.dateCreated.label" /></td>
        <td class="bold">
          <g:formatDate date="${event.date}" type="date" style="SHOROT" />
        </td>
    </tr> 



  </tbody>
</table>