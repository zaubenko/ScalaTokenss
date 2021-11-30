class Participant(TokenAvailable:Int,TokenLocked:Int){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  def SetTokenLocked(newToken:Int):Unit={
    tokenLocked=newToken
  }
  def SetTokenAvailable(newTokenA:Int):Unit={
    tokenAvailable=newTokenA
  }
  def GetTokenLocked():Int={
    return tokenLocked
  }
  def GetTokenAvailable():Int={
    return tokenAvailable
  }
  def PrintInfoParticipant():Unit={
    println("Token available: "+tokenAvailable+"\nToken locked: "+tokenLocked)
  }
  def BuyTokens(TokenAvailable:Int,Bought:Int): Unit ={
    tokenAvailable = TokenAvailable + Bought
    println("Tokens After Buying: "+tokenAvailable)

  }
  def AddTokens(TokenAvailable: Int):Unit={
    tokenAvailable = TokenAvailable + 1
    println("Tokens After Add: "+tokenAvailable)
  }
  def SoldTokens(TokenAvailable:Int,Sold:Int): Unit ={
    tokenAvailable = TokenAvailable - Sold
    println("Tokens after solded: "+tokenAvailable)

  }
}
class Student(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var name:String=Name
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  def Info():Unit={
    println(Name+" have"+(tokenAvailable-tokenLocked)+" token.")
  }
}
class FiveStudent(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Student(Name,TokenLocked,TokenAvailable){
  private var name:String=Name
  private val miningRate:Double=1.1
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class FourStudent(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Student(Name,TokenLocked,TokenAvailable){
  private var name:String=Name
  private val miningRate:Double=1.0
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class ThreeStudent(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Student(Name,TokenLocked,TokenAvailable){
  private var name:String=Name
  private val miningRate:Double=0.9
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class TwoStudent(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Student(Name,TokenLocked,TokenAvailable){
  private var name:String=Name
  private val miningRate:Double=0.8
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class OneStudent(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Student(Name,TokenLocked,TokenAvailable){
  private var name:String=Name
  private val miningRate:Double=0.7
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Teacher(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var name:String=Name
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Manager(Name:String,TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var name:String=Name
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Node(TokenAvailable:Int,TokenLocked:Int,TokenMining:Int,NodeReserve:Int,Income:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  private  var tokenMining=TokenMining
  private var nodeReserve=NodeReserve
  private var income=Income
}

class Exchange(Storage:Double,Bought:Int,Sold:Int,Tokens:Int){
  private var storage:Double=Storage
  private var bought:Int=Bought
  private var sold:Int=Sold
  private var tokens:Int=Tokens
}


var exchange = new Exchange(999999.0,3,6,3)
var node = new Node(100,50,1,1000000,5)
var teacher=new Teacher("Maxim",20,10)
var manager=new Manager("Zheka",20,10)

var fivestudent = new FiveStudent("Danya",30,10)
fivestudent.PrintInfoParticipant()
fivestudent.BuyTokens(30,0)
fivestudent.AddTokens(1)
fivestudent.PrintInfoParticipant()
fivestudent.SoldTokens(22,10)
fivestudent.PrintInfoParticipant()
fivestudent.Info()

var fourStudent=new FourStudent("Kolya",20,10)
fourStudent.PrintInfoParticipant()
fourStudent.BuyTokens(30,0)
fourStudent.AddTokens(0)
fourStudent.PrintInfoParticipant()
fourStudent.SoldTokens(22,10)
fourStudent.PrintInfoParticipant()
fourStudent.Info()

var threeStudent=new ThreeStudent("Egorchik",20,10)
threeStudent.PrintInfoParticipant()
threeStudent.BuyTokens(30,1)
threeStudent.AddTokens(0)
threeStudent.PrintInfoParticipant()
threeStudent.SoldTokens(22,10)
threeStudent.PrintInfoParticipant()
threeStudent.Info()

var twoStudent=new TwoStudent("Maximka",20,10)
twoStudent.PrintInfoParticipant()
twoStudent.BuyTokens(30,2)
twoStudent.AddTokens(30)
twoStudent.PrintInfoParticipant()
twoStudent.SoldTokens(22,10)
twoStudent.PrintInfoParticipant()
twoStudent.Info()

var oneStudent=new OneStudent("Ruslanchik",20,10)
oneStudent.PrintInfoParticipant()
oneStudent.BuyTokens(30,3)
oneStudent.AddTokens(0)
oneStudent.PrintInfoParticipant()
oneStudent.SoldTokens(22,10)
oneStudent.PrintInfoParticipant()
oneStudent.Info()