var l: List[String]= List[String]("Mama", "Paul", "Alex", "Le monsieur")

println(l.mkString(","))

if(l.contains("Paul")) println("un message")


//_ = element // != pour different
var list: List[String] = l.filter(_!="Paul")


println(list.mkString(","))




