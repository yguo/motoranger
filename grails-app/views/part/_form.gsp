<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="part.name.label" /><span class="required-mark">*</span>
  </label>
  <div class="col-sm-10">
    <g:textField name="name" readonly value="${part?.name}" class="form-control" />
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="part.title.label" />
  </label>
  <div class="col-sm-10">
    <g:textField name="title" value="${part?.title}" class="form-control" />
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="default.tags.label" />
  </label>
  <div class="col-sm-10">
    <ul name="tags" id='tag-field' >
      <g:each in="${part.tags}">
        <li>${it}</li>
      </g:each>
    </ul>
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="default.description.label" />
  </label>
  <div class="col-sm-10">
    <g:textField name="description" value="${part?.description}" class="form-control" />
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="part.cost.label" />
  </label>
  <div class="col-sm-10">
    <g:textField type="number" name="cost" value="${part?.cost}" class="form-control" />
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    歷史成本
  </label>
  <div class="col-sm-10">
    <h4>
      <g:each var="it" in="${historyCost}">

        <li class="btn btn-link" id='historyCost' data-historyCost='${it}' >${it}</li>

      </g:each>
    </h4>
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="part.price.label" />
  </label>
  <div class="col-sm-10">
    <g:textField type="number" name="price" value="${part?.price}" class="form-control" />
  </div>

</div>

<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    歷史售價
  </label>
  <div class="col-sm-10">
    <h4>
      <g:each var="it" status="i" in="${historyPrice}">

        <li class="btn btn-link" id='historyPrice' data-historyPrice='${it}' >${it}</li>

      </g:each>
    </h4>
  </div>

</div>


<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="part.stockCount.label" />
  </label>
  <div class="col-sm-10">
    <g:textField type="number" name="stockCount" value="${part?.stockCount}" class="form-control" />
  </div>

</div>

 <div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="user.label" default="Store" />
  </label>
  <div class="col-sm-10">
    <g:select id="user" name="user.id" from="${motoranger.User.list()}" optionKey="id" value="${params?.user?.id}" class="many-to-one" noSelection="['null': '']" class="form-control" />
  </div>

</div> 
<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
    <g:message code="user.store.label" default="Store" />
  </label>
  <div class="col-sm-10">
    <g:select id="store" name="store.id" from="${motoranger.Store.list()}" optionKey="id" value="${part?.store?.id}" class="many-to-one" noSelection="['null': '']" class="form-control" />
  </div>

</div>       



<div class="form-group">
  
  <label for="inputEmail3" class="col-sm-2 control-label">
  <g:message code="default.imageUpload.label" />
  </label>
  <div class="col-sm-10">
  <g:render template="/attachment/uploadBtn" model="[name:part.name ,mainImage: part?.mainImage]" />
  </div>

</div>


<r:script>


  $(function() {

  $("ul[name='tags']").tagit({select:true, tagSource: "${g.createLink(controller:'tag',action: 'listAsJson')}"});

  $("li[id ='historyCost']").on('click',function(eventObject){
    var historyCost = $(this).attr("data-historyCost");
    $("#cost").val(historyCost)
  });

  $("li[id ='historyPrice']").on('click',function(eventObject){
    var historyCost = $(this).attr("data-historyPrice");
    $("#price").val(historyCost)
  });

  });


</r:script>