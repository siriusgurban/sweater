<#macro login path>
<form action="${path}" method="post">
    <div><label> User Name : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <div><input type="submit" value="Sign In"/></div>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <input type="submit" value="Sign Out"/>
    </form>
</#macro>

<#--<form method="post">-->
<#--    <input type="text" name="text" placeholder="Mesaji daxil edin">-->
<#--    <input type="text" name="tag" placeholder="Tagi daxil edin">-->
<#--    <input type="hidden" name="_csrf" value="${_csrf.token}" />-->
<#--    <button type="submit">Əlavə edin</button>-->
<#--</form>-->