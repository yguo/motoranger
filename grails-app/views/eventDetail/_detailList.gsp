	<div class="row-fluid">
	  <div class="span10 well well-small">
     

			<sec:ifAnyGranted roles="ROLE_OPERATOR">
	      <div class="row-fluid">

	        <div class="span4">
						

				        <g:link
				            class="btn btn-danger btn-large pull-right"
				            action="delete"
				            controller="eventDetail"
				            id="${detail.id}"  >
				          <g:message code="default.button.delete.label" />
				        </g:link>	
				        <g:link
				            class="btn btn-primary btn-large"
				            action="edit"
				            controller="eventDetail"
				            id="${detail.id}"  >
				          <g:message code="default.button.edit.label" />
				        </g:link>		           	           

	        </div>
	      </div>
	    </sec:ifAnyGranted>


	    <div class="row-fluid">
	      <div class="span2 well well-small">
	        <g:message code="default.dateCreated.label" />
	        <div class="row-fluid">
	            <g:formatDate date="${detail.lastUpdated}" type="date" style="SHOROT" />
	        </div>
	      </div>

	      <div class="span2 well well-small">
	        <g:message code="part.label" />
	        <div class="row-fluid">
	          ${detail?.part?.title}
	        </div>
	      </div>

				<sec:ifLoggedIn>
		      <div class="span2 well well-small">
		        <g:message code="eventDetail.price.label" />
		        <div class="row-fluid">
							${detail?.price}
		        </div>
		      </div>
				</sec:ifLoggedIn>
				<sec:ifAnyGranted roles="ROLE_MANERGER">
		      <div class="span2 well well-small">
						<g:message code="part.cost.label" />
		        <div class="row-fluid">
							${detail?.part?.cost}
		        </div>
		      </div>
				</sec:ifAnyGranted>
	    </div>

	  </div>

			<g:if test="${detail?.mainImage}">
      <div class="span2">
        <div class="row-fluid">
          <g:link action="show" controller="attachment" params="[name:detail.name ,file:detail.mainImage]"><g:img  alt="" uri="attachment/show?name=${detail.name}&file=${detail.mainImage}" /></g:link>
					
        </div>
      </div>
			</g:if>
	</div>