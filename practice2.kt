fun main() 
{
    val num = (1..1000).rondom()
    val odd = (num%2 == 1)
        
    if (odd) 
        println("${num}は奇数です")
    else 
        println("${num}は偶数です") 
}