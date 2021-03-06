
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="bootstrap">

<g:set var="entityName" value="${message(code: 'part.label', default: '文章')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>


</head>
<body>

  <sec:ifAnyGranted roles="ROLE_OPERATOR">

    <div class="row" id="actionbar">

      <div class="col-sm-4 col-md-4">

        <g:link class="btn btn-primary btn-large "
          action="edit" controller="eventDetail" id="${eventDetail.id}" >
        <g:message code="default.button.edit.label" />
        </g:link>


        <g:link class="btn btn-danger"
          action="delete" controller="eventDetail" id="${eventDetail.id}" >
          <g:message code="default.button.delete.label" />
        </g:link> 
      </div>

    </div>  

  </sec:ifAnyGranted>


  <div class="row">
    <div class="contact-info col-sm-8 col-md-8">
      <h2>維修細項</h2>
      <g:render template="content" model="[eventDetail: eventDetail]" />
    </div>
    <div class="contact-info col-sm-4 col-md-4">
      <h2>耗材資料</h2>
      <g:render template="/part/content" model="[part: eventDetail.part]" />
    </div>
  </div>


  <div class="row">

    <div class="contact-info col-sm-8 col-md-8">
      <h2>維修記錄</h2>
      <g:render template="/event/content" model="[event: eventDetail.head]" />
    </div>
    <div class="contact-info col-sm-4 col-md-4">
      <h2>維修機車資料</h2>
      <g:render template="/product/content" model="[product: eventDetail.head.product]" />
    </div>
  </div>
            
</body>
</html>
