<#import "parts/common.ftl" as c>


<@c.page>
    <div class="form-row">
        <div class="form-group col-md-6">
            <form action="/main" method="get" class="form-inline">
                <input type="text" name="filter" class="form-control" placeholder="Search by tag" value="${filter?ifExists}">
                <button type="submit" class="btn btn-primary ml-2">Axtar</button>
            </form>
        </div>
    </div>

    <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
        Add new message
    </a>

    <div class="collapse" id="collapseExample">
        <div class="form-group mt-3">
            <form method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <input type="text" name="text" placeholder="Mesaji daxil edin" class="form-control">
                </div>
                <div class="form-group">
                    <input type="text" name="tag" placeholder="Tagi daxil edin" class="form-control">
                </div>
                <div class="form-group">
                    <div class="custom-file">
                        <input type="file" name="file" for="customFile" id=customFile" class="custom-file-input">
                        <label class="custom-file-label" for="customFile">Choose file</label>
                    </div>
                </div>
                <div class="form-group">
                    <input type="hidden" name="_csrf" value="${_csrf.token}" />
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Əlavə edin</button>
                </div>
            </form>
        </div>
    </div>

    <div class="card-columns">
        <#list messages as message>
            <div class="card my-3">
                <#if message.filename??>
            <img src="/img/${message.filename}" alt="" class="card-img-top">
                </#if>
                <div class="m-2">
                    <span>${message.text}</span>
                    <i>${message.tag}</i>
                </div>
                <div class="card-footer text-muted">
                    ${message.authorName}
                </div>
            </div>
        <#else>
            No message
        </#list>
    </div>
</@c.page>