package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://platform.linkedin.com/in.js\">\r\n");
      out.write("  api_key:77a3gl1p3tvgf0\r\n");
      out.write("  onLoad: OnLinkedInFrameworkLoad\r\n");
      out.write("  authorize:true\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/linkedinAuth.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script type=\"in/Login\">\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("  // This is called with the results from from FB.getLoginStatus().\r\n");
      out.write("  function statusChangeCallback(response) {\r\n");
      out.write("    console.log('statusChangeCallback');\r\n");
      out.write("    console.log(response);\r\n");
      out.write("    // The response object is returned with a status field that lets the\r\n");
      out.write("    // app know the current login status of the person.\r\n");
      out.write("    // Full docs on the response object can be found in the documentation\r\n");
      out.write("    // for FB.getLoginStatus().\r\n");
      out.write("    if (response.status === 'connected') {\r\n");
      out.write("      // Logged into your app and Facebook.\r\n");
      out.write("      testAPI();\r\n");
      out.write("    } else if (response.status === 'not_authorized') {\r\n");
      out.write("      // The person is logged into Facebook, but not your app.\r\n");
      out.write("      document.getElementById('status').innerHTML = 'Please log ' +\r\n");
      out.write("        'into this app.';\r\n");
      out.write("    } else {\r\n");
      out.write("      // The person is not logged into Facebook, so we're not sure if\r\n");
      out.write("      // they are logged into this app or not.\r\n");
      out.write("      document.getElementById('status').innerHTML = 'Please log ' +\r\n");
      out.write("        'into Facebook.';\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // This function is called when someone finishes with the Login\r\n");
      out.write("  // Button.  See the onlogin handler attached to it in the sample\r\n");
      out.write("  // code below.\r\n");
      out.write("  function checkLoginState() {\r\n");
      out.write("    FB.getLoginStatus(function(response) {\r\n");
      out.write("      statusChangeCallback(response);\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  window.fbAsyncInit = function() {\r\n");
      out.write("  FB.init({\r\n");
      out.write("    appId      : '754536827991813',\r\n");
      out.write("    cookie     : true,  // enable cookies to allow the server to access \r\n");
      out.write("                        // the session\r\n");
      out.write("    xfbml      : true,  // parse social plugins on this page\r\n");
      out.write("    version    : 'v2.2' // use version 2.2\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  // Now that we've initialized the JavaScript SDK, we call \r\n");
      out.write("  // FB.getLoginStatus().  This function gets the state of the\r\n");
      out.write("  // person visiting this page and can return one of three states to\r\n");
      out.write("  // the callback you provide.  They can be:\r\n");
      out.write("  //\r\n");
      out.write("  // 1. Logged into your app ('connected')\r\n");
      out.write("  // 2. Logged into Facebook, but not your app ('not_authorized')\r\n");
      out.write("  // 3. Not logged into Facebook and can't tell if they are logged into\r\n");
      out.write("  //    your app or not.\r\n");
      out.write("  //\r\n");
      out.write("  // These three cases are handled in the callback function.\r\n");
      out.write("\r\n");
      out.write("  FB.getLoginStatus(function(response) {\r\n");
      out.write("    statusChangeCallback(response);\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  };\r\n");
      out.write("\r\n");
      out.write("  // Load the SDK asynchronously\r\n");
      out.write("  (function(d, s, id) {\r\n");
      out.write("    var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("    if (d.getElementById(id)) return;\r\n");
      out.write("    js = d.createElement(s); js.id = id;\r\n");
      out.write("    js.src = \"//connect.facebook.net/en_US/sdk.js\";\r\n");
      out.write("    fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("  }(document, 'script', 'facebook-jssdk'));\r\n");
      out.write("\r\n");
      out.write("  // Here we run a very simple test of the Graph API after login is\r\n");
      out.write("  // successful.  See statusChangeCallback() for when this call is made.\r\n");
      out.write("  function testAPI() {\r\n");
      out.write("    console.log('Welcome!  Fetching your information.... ');\r\n");
      out.write("    FB.api('/me', function(response) {\r\n");
      out.write("      console.log('Successful login for: ' + response.name);\r\n");
      out.write("      document.getElementById('status').innerHTML =\r\n");
      out.write("        'Thanks for logging in, ' + response.name + '!';\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<fb:login-button scope=\"public_profile,email\" onlogin=\"checkLoginState();\">\r\n");
      out.write("</fb:login-button>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
