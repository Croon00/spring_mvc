/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-08-23 04:10:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fjoin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/workspace/spring_mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project_01/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/workspace/spring_mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project_01/WEB-INF/lib/spring-webmvc-5.3.9.jar!/META-INF/spring-form.tld", Long.valueOf(1626212264000L));
    _jspx_dependants.put("jar:file:/C:/workspace/spring_mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project_01/WEB-INF/lib/spring-webmvc-5.3.9.jar!/META-INF/spring.tld", Long.valueOf(1626212264000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1627439210123L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.9.jar", Long.valueOf(1627439430870L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<!-- BOOTSTRAP and JQuery CDN -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	//아아디 중복 여부를 확인할 변수\r\n");
      out.write("	var chk1 = false;\r\n");
      out.write("\r\n");
      out.write("	function check_input(){\r\n");
      out.write("		\r\n");
      out.write("		// 사용자가 입력한 내용을 가져온다.\r\n");
      out.write("		var user_name = $(\"#user_name\").val()\r\n");
      out.write("		var user_id = $(\"#user_id\").val()\r\n");
      out.write("		var user_pw = $(\"#user_pw\").val()\r\n");
      out.write("		var user_pw2 = $(\"#user_pw2\").val()\r\n");
      out.write("		var user_postal_code = $(\"#user_postal_code\").val()\r\n");
      out.write("		var user_addr1 = $(\"#user_addr1\").val()\r\n");
      out.write("		var user_addr2 = $(\"#user_addr2\").val()\r\n");
      out.write("		\r\n");
      out.write("		// console.log(user_name)\r\n");
      out.write("		// console.log(user_id)\r\n");
      out.write("		// console.log(user_pw)\r\n");
      out.write("		// console.log(user_pw2)\r\n");
      out.write("		\r\n");
      out.write("		// 정규식\r\n");
      out.write("		// 한글만 허용하며 2~4글자까지.\r\n");
      out.write("		var name_pattern = /^[가-힣]{2,4}$/\r\n");
      out.write("		// 첫글자는 영문대소문자, 나머지는 영문대소 숫자, 4 ~ 20글자\r\n");
      out.write("		var id_pattern =  /^[A-Za-z]{1}[A-Za-z0-9]{3,19}$/\r\n");
      out.write("		// 최소 8글자이며 숫자,문자,특수문자가 최소 1개씩 있어야 한다.\r\n");
      out.write("		var pw_pattern =  /^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$/\r\n");
      out.write("		\r\n");
      out.write("		if(name_pattern.test(user_name) == false){\r\n");
      out.write("			alert(\"사용자 이름은 한글 2~4글자만 허용합니다\")\r\n");
      out.write("			// 입력한 칸을 비운다.\r\n");
      out.write("			$(\"#user_name\").val('')\r\n");
      out.write("			// 포커스를 준다.\r\n");
      out.write("			$(\"#user_name\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(id_pattern.test(user_id) == false){\r\n");
      out.write("			alert(\"아이디는 영문으로시작하고 영문과 숫자, 4 ~ 20글자를 허용합니다\")\r\n");
      out.write("			$(\"#user_id\").val('')\r\n");
      out.write("			$(\"#user_id\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(chk1 == false) {\r\n");
      out.write("			alert(\"아이디 중복 확인을 해주세요\")\r\n");
      out.write("			$(\"#user_id\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(pw_pattern.test(user_pw) == false){\r\n");
      out.write("			alert(\"비밀번호는 8글자 이상이며, 영문,숫자,특수문자를 포함해야 합니다\")\r\n");
      out.write("			$(\"#user_pw\").val('')\r\n");
      out.write("			$(\"#user_pw\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(pw_pattern.test(user_pw2) == false){\r\n");
      out.write("			alert(\"비밀번호는 8글자 이상이며, 영문,숫자,특수문자를 포함해야 합니다\")\r\n");
      out.write("			$(\"#user_pw2\").val('')\r\n");
      out.write("			$(\"#user_pw2\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(user_pw != user_pw2){\r\n");
      out.write("			alert('비밀번호가 일치하지 않습니다')\r\n");
      out.write("			$(\"#user_pw\").val('')\r\n");
      out.write("			$(\"#user_pw2\").val('')\r\n");
      out.write("			$(\"#user_pw\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(user_postal_code.length == 0){\r\n");
      out.write("			alert('주소를 검색해주세요')\r\n");
      out.write("			$(\"#user_postal_code\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(user_addr2.length == 0){\r\n");
      out.write("			alert('상세주소를 입력해주세요')\r\n");
      out.write("			$(\"#user_addr2\").focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		return true\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	// 아이디 중복확인\r\n");
      out.write("	function checkUserId(){\r\n");
      out.write("		// 입력한 아이디를 가져온다.\r\n");
      out.write("		var user_id = $(\"#user_id\").val()\r\n");
      out.write("		\r\n");
      out.write("		var id_pattern = /^[A-Za-z]{1}[A-Za-z0-9]{3,19}$/\r\n");
      out.write("		\r\n");
      out.write("		if(id_pattern.test(user_id) == false){\r\n");
      out.write("			alert(\"아이디는 영문으로시작하고 영문과 숫자, 4 ~ 20글자를 허용합니다\")\r\n");
      out.write("			$(\"#user_id\").val('')\r\n");
      out.write("			$(\"#user_id\").focus()\r\n");
      out.write("			return\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		// Ajax\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			// 요청할 페이지 주소\r\n");
      out.write("			url : \"check_user_id\",\r\n");
      out.write("			// 요청방식\r\n");
      out.write("			type : 'get',\r\n");
      out.write("			// 서버로 보내는 데이터\r\n");
      out.write("			data : {'new_id' : user_id},\r\n");
      out.write("			// 서버가 전달하는 결과 데이터 타입\r\n");
      out.write("			dataType : 'text',\r\n");
      out.write("			// 통신이 완료되면 호출되는 함수\r\n");
      out.write("			success : function(result){\r\n");
      out.write("				// alert(result.trim())\r\n");
      out.write("				// YES가 전달 됬다면..\r\n");
      out.write("				if(result.trim() == \"YES\"){\r\n");
      out.write("					alert('사용가능한 아이디 입니다')\r\n");
      out.write("					chk1 = true\r\n");
      out.write("					$(\"#user_id\").attr(\"readonly\", true)\r\n");
      out.write("				} else {\r\n");
      out.write("					alert('사용불가능한 아이디 입니다')\r\n");
      out.write("					$(\"#user_id\").val('')\r\n");
      out.write("					$(\"#user_id\").focus()\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<title>user/user_join.jsp</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- 상단 메뉴 -->\r\n");
      out.write("	");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div class='container' style='margin-top:100px'>\r\n");
      out.write("	\r\n");
      out.write("		<div class='row'>\r\n");
      out.write("			<div class='col-sm-3'></div>\r\n");
      out.write("			<div class='col-sm-6'>\r\n");
      out.write("				<div class='card shadow'>\r\n");
      out.write("					<div class='card-body'>\r\n");
      out.write("						<!-- 회원 가입 폼 -->\r\n");
      out.write("						<form action='user_join_pro' method='post' onsubmit='return check_input()'>\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<label for='user_name'>이름</label>\r\n");
      out.write("								<input type='text' id='user_name' name='user_name' class='form-control'/>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<label for='user_id'>아이디</label>\r\n");
      out.write("								<div class='input-group'>\r\n");
      out.write("									<input type='text' id='user_id' name='user_id' class='form-control'/>\r\n");
      out.write("									<div class='input-group-append'>\r\n");
      out.write("										<button type='button' class='btn btn-primary' onclick='checkUserId()'>중복확인</button>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<label for='user_pw'>비밀번호</label>\r\n");
      out.write("								<input type='password' id='user_pw' name='user_pw' class='form-control'/>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<label for='user_pw2'>비밀번호 확인</label>\r\n");
      out.write("								<input type='password' id='user_pw2' name='user_pw2' class='form-control'/>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<label for='user_postal_code'>주소</label>\r\n");
      out.write("								<div class='input-group'>\r\n");
      out.write("									<input type='text' id='user_postal_code' name='user_postal_code' class='form-control' readonly=\"readonly\"/>\r\n");
      out.write("									<div class='input-group-append'>\r\n");
      out.write("										<button type='button' class='btn btn-primary' onclick='sample2_execDaumPostcode()'>주소검색</button>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<input type='text' id='user_addr1' name='user_addr1' class='form-control' readonly=\"readonly\"/>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<input type='text' id='user_addr2' name='user_addr2' class='form-control'/>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class='form-group'>\r\n");
      out.write("								<div class='text-right'>\r\n");
      out.write("									<button type='submit' class='btn btn-primary'>가입완료</button>\r\n");
      out.write("									<a href='user_login' class='btn btn-info'>로그인</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='col-sm-3'></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");
      if (_jspx_meth_c_005fimport_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("	");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /WEB-INF/views/user/user_join.jsp(151,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("/WEB-INF/views/include/top_menu.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /WEB-INF/views/user/user_join.jsp(154,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("/WEB-INF/views/include/daum_address.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f2_reused = false;
    try {
      _jspx_th_c_005fimport_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f2.setParent(null);
      // /WEB-INF/views/user/user_join.jsp(225,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f2.setUrl("/WEB-INF/views/include/bottom_info.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f2 = _jspx_th_c_005fimport_005f2.doStartTag();
        if (_jspx_th_c_005fimport_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f2);
      _jspx_th_c_005fimport_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f2_reused);
    }
    return false;
  }
}
