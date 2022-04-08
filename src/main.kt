fun main(){
     var numbers = multiply(arrayOf(4,5,6,10))
     println(numbers)
     var nums = sumMixedArray(arrayOf(30.5F, 3, 40.5))
     println(nums)
     var vowels = noVowelsArray(arrayOf('q','a','w', 'e', 'o', 's' ))
     println(vowels)
}
//Write a function that takes in an array of integers and returns the product of
//all the elements
fun multiply(nums:Array<Int>):Int{
     var product = 1
     nums.forEach { nums ->
          product *= nums
     }
     return product
}
//Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements
fun sumMixedArray(number: Array<Any>):Double{
     var sum = 0.0
     number.forEach { number ->
          if (number is Double || number is Float){
            sum += number.toString().toDouble()
          }
     }
     return sum
}
//Write a function that takes in an array of characters and returns the number of
//vowels in the array
fun noVowelsArray(vowels: Array<Char>):Int {
     var letters = 0
     vowels.forEach { char ->
          if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
               ++letters
          }
     }
     return letters
}



