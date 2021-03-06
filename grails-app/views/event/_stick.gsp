

<div class="${stickName}-stick stick event">

  <p>
    <g:link controller="event" action="show" id="${event?.id}">
    ${event?.name}
  </g:link> 
  </p>

  <p>
    <i class="icon-screenshot"></i> 
    產品編號：<g:link controller="product" action="show" id="${event?.product?.id}">
    ${event.product.name.replace(event.product.name.substring(2,4),"**")}
  </g:link> 
  </p>
  
  <p>
    <i class="icon-user"></i>
    維修人員：
    <g:link controller="user" action="show" id="${event?.user.id}" > 
      ${event?.user}
    </g:link>
  </p>

  <p>
    <i class="icon-user"></i> 
    維修店家：
    <g:link controller="store" action="show" id="${event?.user.store.id}" >
      ${event?.user.store.title}
    </g:link> 


  </p>

  
  <sec:ifAnyGranted roles="ROLE_OPERATOR">
    <p class="date">
      <i class="icon-calendar"></i>
      維修總額： ${event.totalPrice}
    </p>
  </sec:ifAnyGranted>


  <sec:ifAnyGranted roles="ROLE_OPERATOR">
    <g:if test="${actionName != 'pickPartAddDetail' }" >
      <g:link class="btn btn-primary" controller="event" action="pickPartAddDetail" id="${event?.id}">新增維修</g:link>

    </g:if>

    <g:render template="/event/statusChangeBtn" model="[event: event]" />

  </sec:ifAnyGranted>

</div>

