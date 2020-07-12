<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<div>
    <@l.logout />
    <span><a href="/user">Istifadecilerin siyahisi</a></span>
</div>
    <div>
        <form method="post">
            <input type="text" name="text" placeholder="Mesaji daxil edin">
            <input type="text" name="tag" placeholder="Tagi daxil edin">
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit">Əlavə edin</button>
        </form>
    </div>
<div>Mesajlarin siyahisi</div>
    <form action="/main" method="get">
        <input type="text" name="filter" value="${filter}">
        <button type="submit">Axtar</button>
    </form>
<#list messages as message>
    <div>
        <b>${message.id}</b>
        <span>${message.text}</span>
        <i>${message.tag}</i>
        <strong>${message.authorName}</strong>
    </div>
    <#else>
        No message
</#list>
</@c.page>