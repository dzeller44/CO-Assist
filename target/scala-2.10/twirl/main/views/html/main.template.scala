
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[User,Html,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""), isLoggedIn: String = "", currentEmail: String=controllers.helpers.AccessMiddleware.getSessionEmail())(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.164*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
		<title>CO-Assist | Colorado Department of Homeland Security Emergency Management</title>
  		<link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("img/favicon.ico")),format.raw/*8.90*/("""">
  	  	
  		<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,700,500,700italic,900,900italic' rel='stylesheet' type='text/css'>
		<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

		<link rel="stylesheet" href=""""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/app.css")),format.raw/*15.64*/("""">
		<link href=""""),_display_(/*16.16*/routes/*16.22*/.Assets.at("css/flexslider.css")),format.raw/*16.54*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*17.16*/routes/*17.22*/.Assets.at("css/prettyPhoto.css")),format.raw/*17.55*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*18.16*/routes/*18.22*/.Assets.at("css/animate.css")),format.raw/*18.51*/("""" rel="stylesheet" type="text/css" media="all" />
		<link href=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("css/owl.carousel.css")),format.raw/*19.56*/("""" rel="stylesheet">
		<link href=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("css/style.css")),format.raw/*20.49*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*21.16*/routes/*21.22*/.Assets.at("css/formoid/formoid-solid-dark.css")),format.raw/*21.70*/("""" rel="stylesheet" type="text/css" />
         
	    <script data-main=""""),_display_(/*23.26*/routes/*23.32*/.Assets.at("js/main.js")),format.raw/*23.56*/("""" src=""""),_display_(/*23.64*/routes/*23.70*/.Assets.at("lib/requirejs/require.js")),format.raw/*23.108*/(""""></script>
	    <script src=""""),_display_(/*24.20*/routes/*24.26*/.Assets.at("lib/angularjs/angular.js")),format.raw/*24.64*/("""" type="text/javascript"></script>
	   	<script src=""""),_display_(/*25.20*/routes/*25.26*/.Assets.at("js/jquery/jquery.min.js")),format.raw/*25.63*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(/*26.20*/routes/*26.26*/.Assets.at("js/password.js")),format.raw/*26.54*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*27.17*/routes/*27.23*/.Assets.at("js/jquery/jquery.prettyPhoto.js")),format.raw/*27.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*28.17*/routes/*28.23*/.Assets.at("js/jquery/jquery.nicescroll.min.js")),format.raw/*28.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*29.17*/routes/*29.23*/.Assets.at("js/superfish.min.js")),format.raw/*29.56*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*30.17*/routes/*30.23*/.Assets.at("js/jquery/jquery.flexslider-min.js")),format.raw/*30.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*31.17*/routes/*31.23*/.Assets.at("js/owl.carousel.js")),format.raw/*31.55*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("js/animate.js")),format.raw/*32.50*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("js/jquery/jquery.BlackAndWhite.js")),format.raw/*33.70*/(""""></script>
		<script src=""""),_display_(/*34.17*/routes/*34.23*/.Assets.at("js/myscript.js")),format.raw/*34.51*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*35.17*/routes/*35.23*/.Assets.at("js/global.js")),format.raw/*35.49*/("""" type="text/javascript"></script>
	    <script>
						//PrettyPhoto
						jQuery(document).ready(function() """),format.raw/*38.41*/("""{"""),format.raw/*38.42*/("""
							"""),format.raw/*39.8*/("""$("a[rel^='prettyPhoto']").prettyPhoto();
						"""),format.raw/*40.7*/("""}"""),format.raw/*40.8*/(""");

						//BlackAndWhite
						$(window).load(function() """),format.raw/*43.33*/("""{"""),format.raw/*43.34*/("""
							"""),format.raw/*44.8*/("""$('.client_img').BlackAndWhite("""),format.raw/*44.39*/("""{"""),format.raw/*44.40*/("""
								"""),format.raw/*45.9*/("""hoverEffect : true, // default true
								// set the path to BnWWorker.js for a superfast implementation
								webworkerPath : false,
								// for the images with a fluid width and height
								responsive : true,
								// to invert the hover effect
								invertHoverEffect : false,
								// this option works only on the modern browsers ( on IE lower than 9 it remains always 1)
								intensity : 1,
								speed : """),format.raw/*54.17*/("""{"""),format.raw/*54.18*/(""" """),format.raw/*54.19*/("""//this property could also be just speed: value for both fadeIn and fadeOut
									fadeIn : 300, // 200ms for fadeIn animations
									fadeOut : 300
								// 800ms for fadeOut animations
								"""),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""",
								onImageReady : function(img) """),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""
									"""),format.raw/*60.10*/("""// this callback gets executed anytime an image is converted
								"""),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
							"""),format.raw/*62.8*/("""}"""),format.raw/*62.9*/(""");
						"""),format.raw/*63.7*/("""}"""),format.raw/*63.8*/(""");
					</script>   

    </head>
<body>

	<!-- PRELOADER -->
	<img id="preloader" src=""""),_display_(/*70.28*/routes/*70.34*/.Assets.at("img/preloader.gif")),format.raw/*70.65*/("""" alt="" />
	<!-- //PRELOADER -->
	<div class="preloader_hide">

		<!-- PAGE -->
		<div id="page">


			<!-- HEADER -->
			<header>

				<!-- MENU BLOCK -->
				<div class="menu_block">

					<!-- CONTAINER -->
					<div class="container clearfix">

						<!-- LOGO -->
						<div class="logo pull-left">
							<a href="/"><img src=""""),_display_(/*89.31*/routes/*89.37*/.Assets.at("img/co/DHSEM_Logo_80px.png")),format.raw/*89.77*/(""""></a>
						</div>
						<!-- //LOGO -->

						<!-- MENU -->
						<div class="pull-right">
							<nav class="navmenu center">
								<ul>
									<li class="scroll_btn"><a href="/">Home</a></li>
									<li class="scroll_btn"><a href="/signup">Register</a></li>
  									<li class="scroll_btn"><a href="/admin">Admin</a></li>
  									<li class="scroll_btn"><a href="/contact">Contact</a></li>
  									"""),_display_(/*101.13*/if(Option(currentEmail).forall(_.isEmpty))/*101.55*/ {_display_(Seq[Any](format.raw/*101.57*/("""
  										"""),format.raw/*102.13*/("""<li class="scroll_btn"><a href="/auth">Login</a></li>
  									""")))}/*103.14*/else/*103.19*/{_display_(Seq[Any](format.raw/*103.20*/("""
  									  	"""),format.raw/*104.15*/("""<li class="scroll_btn"><a href="/logout">Logout</a></li>									
  										<li class="scroll_btn"><a href="/useraccount?email="""),_display_(/*105.65*/currentEmail),format.raw/*105.77*/("""" style="text-transform: lowercase;">"""),_display_(/*105.115*/currentEmail),format.raw/*105.127*/("""</a></li>
  									""")))}),format.raw/*106.13*/("""
								"""),format.raw/*107.9*/("""</ul>
							</nav>
						</div>
						<!-- //MENU -->
					</div>
					<!-- //MENU BLOCK -->
				</div>
				<!-- //CONTAINER -->
			</header>
			<!-- //HEADER -->
			<!-- HOME -->
			<section id="home" class="padbot0">

				<div class="mainBlock">

					<!-- CONTAINER -->
					<div class="container" data-appear-top-offset="-200"
						data-animated="fadeInUp">

						<!-- CUSTOM TAB -->
						<div id="myTabContent" class="tab-content">
							<div class="tab-pane fade in active clearfix" id="tab1">
								<p class="title">
									<b>CO-Assist</b>
								</p>
								<span>The Colorado Department of Public Safety's Division
									of Homeland Security and Emergency Management collects and
									stores local business information for an emergency response to
									natural disasters in the state of Colorado. </span>
							</div>

						</div>
						<!-- //CONTAINER -->
					</div>
					<!-- //CLEAN CODE -->
				</div> <!-- //Main Block -->
			</section>
			<!-- //HOME -->


  			<!--  <div ng-view></div> -->
  			<!-- Used for padding and scrolling -->
			<section id="blankMain">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
  			<div>"""),_display_(/*153.12*/content),format.raw/*153.19*/("""</div>
  
  
  			<!-- Used for padding and scrolling -->
			<section id="blank1">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank2">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank3">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank4">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank5">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank6">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
  			<!-- FOOTER -->
			<footer>
				<div class="container">
					<div class="row" data-appear-top-offset="-200">
						<div class="socialCenterAll">
							<ul class="social">
								<li><a href="http://www.dhsem.state.co.us/" target="_blank">DHSEM</a></li>
								<li><a href="https://facebook.com/COEmergency"
									target="_blank"><i class="fa fa-facebook"></i></a></li>
								<li><a
									href="https://www.google.com/maps/place/9195+E+Mineral+Ave,+Centennial,+CO+80112"
									target="_blank"><i class="map_show fa fa-map-marker"></i></a></li>
								<li><a href="https://www.colorado.gov/publicsafety"
									target="_blank">CDPS</a></li>
							</ul>
						</div>
					</div>
					<div class="row copyright">
						<div class="col-lg-12 text-center">
							<p>Colorado Division of Homeland Security and Emergency
								Management</p>
						</div>
						<div class="linkBack"><a href="https://icons8.com" target="_blank">Icon pack by Icons8</a>&nbsp;||&nbsp;<a href="http://formoid.com/" target="_blank">Forms by Formoid</a></div>
					</div>
				</div>
			</footer>
		</div>
	</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(user:User,scripts:Html,isLoggedIn:String,currentEmail:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts,isLoggedIn,currentEmail)(content)

  def f:((User,Html,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts,isLoggedIn,currentEmail) => (content) => apply(user,scripts,isLoggedIn,currentEmail)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:50:29 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/main.scala.html
                  HASH: e10c0095a26bf9d54e8e88e52e2b1cef94cc3cea
                  MATRIX: 765->1|1023->163|1053->167|1264->352|1278->358|1327->387|2102->1135|2117->1141|2163->1166|2209->1185|2224->1191|2277->1223|2358->1277|2373->1283|2427->1316|2508->1370|2523->1376|2573->1405|2666->1471|2681->1477|2736->1511|2799->1547|2814->1553|2862->1580|2943->1634|2958->1640|3027->1688|3129->1763|3144->1769|3189->1793|3224->1801|3239->1807|3299->1845|3358->1877|3373->1883|3432->1921|3514->1976|3529->1982|3587->2019|3669->2074|3684->2080|3733->2108|3812->2160|3827->2166|3893->2211|3972->2263|3987->2269|4056->2317|4135->2369|4150->2375|4204->2408|4283->2460|4298->2466|4367->2514|4446->2566|4461->2572|4514->2604|4593->2656|4608->2662|4656->2689|4735->2741|4750->2747|4818->2794|4874->2823|4889->2829|4938->2857|5017->2909|5032->2915|5079->2941|5219->3053|5248->3054|5284->3063|5360->3112|5388->3113|5477->3174|5506->3175|5542->3184|5601->3215|5630->3216|5667->3226|6136->3667|6165->3668|6194->3669|6426->3874|6455->3875|6523->3915|6552->3916|6591->3927|6688->3997|6717->3998|6753->4007|6781->4008|6818->4018|6846->4019|6969->4115|6984->4121|7036->4152|7417->4506|7432->4512|7493->4552|7950->4981|8002->5023|8043->5025|8086->5039|8173->5107|8187->5112|8227->5113|8272->5129|8431->5260|8465->5272|8532->5310|8567->5322|8622->5345|8660->5355|9963->6630|9992->6637
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|69->38|69->38|70->39|71->40|71->40|74->43|74->43|75->44|75->44|75->44|76->45|85->54|85->54|85->54|89->58|89->58|90->59|90->59|91->60|92->61|92->61|93->62|93->62|94->63|94->63|101->70|101->70|101->70|120->89|120->89|120->89|132->101|132->101|132->101|133->102|134->103|134->103|134->103|135->104|136->105|136->105|136->105|136->105|137->106|138->107|184->153|184->153
                  -- GENERATED --
              */
          