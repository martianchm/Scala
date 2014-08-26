package Unit7

/**
 * Created by chen_ming1 on 2014/8/26.
 */
class MatchExpression {

   def main (args: Array[String]) {
     IsMatch("salt")
  }
    def  IsMatch(content:String){
      val message =  if (content.length() < 1) "" else content
      message match {
        case  "salt" => println("pepper")
        case "chips" => println("salsa")
        case "egges" => println("bacon")
        case _ =>println("bacon")//默认情况下用（_）说明
      }
    }

}

