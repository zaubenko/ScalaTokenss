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
class Student(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class FiveStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=1.1
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class FourStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=1.0
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class ThreeStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.9
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class TwoStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.8
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class OneStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.7
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Teacher(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Manager(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Node(TokenAvailable:Int,TokenLocked:Int,TokenSkillMining:Int,NodeReserve:Int,Income:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  private  var tokenSkillMining=TokenSkillMining
  private var nodeReserve=NodeReserve
  private var income=Income
}
class Platform(Invest:Int,Tokenmission:Int,TokenForSale:Int,Reserve:Int,TokenSkillMining:Int,Income:Int,HolderEmission:Int){
  private var invest=Invest
  private var tokenmission=Tokenmission
  private var tokenForSale=TokenForSale
  private var reserve=Reserve
  private var tokenSkillMining=TokenSkillMining
  private var income=Income
  private var holderEmission=HolderEmission

}
class Holders(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}


class Exchange(Bought:Int,Sold:Int,Tokens:Int){
  private var bought=Bought
  private var sold=Sold
  private var tokens=Tokens


}


var exchange = new Exchange(3,6,3)
var node = new Node(100,50,1,1000000,5)
var teacher=new Teacher(20,10)
var manager=new Manager(20,10)

var fivestudent = new FiveStudent(30,10)
fivestudent.PrintInfoParticipant()
fivestudent.BuyTokens(30,0)
fivestudent.AddTokens(1)
fivestudent.PrintInfoParticipant()
fivestudent.SoldTokens(22,10)
fivestudent.PrintInfoParticipant()

var fourStudent=new FourStudent(20,10)
fourStudent.PrintInfoParticipant()
fourStudent.BuyTokens(30,0)
fourStudent.AddTokens(0)
fourStudent.PrintInfoParticipant()
fourStudent.SoldTokens(22,10)
fourStudent.PrintInfoParticipant()

var threeStudent=new ThreeStudent(20,10)
threeStudent.PrintInfoParticipant()
threeStudent.BuyTokens(30,1)
threeStudent.AddTokens(0)
threeStudent.PrintInfoParticipant()
threeStudent.SoldTokens(22,10)
threeStudent.PrintInfoParticipant()

var twoStudent=new TwoStudent(20,10)
twoStudent.PrintInfoParticipant()
twoStudent.BuyTokens(30,2)
twoStudent.AddTokens(30)
twoStudent.PrintInfoParticipant()
twoStudent.SoldTokens(22,10)
twoStudent.PrintInfoParticipant()

var oneStudent=new OneStudent(20,10)
oneStudent.PrintInfoParticipant()
oneStudent.BuyTokens(30,3)
oneStudent.AddTokens(0)
oneStudent.PrintInfoParticipant()
oneStudent.SoldTokens(22,10)
oneStudent.PrintInfoParticipant()

