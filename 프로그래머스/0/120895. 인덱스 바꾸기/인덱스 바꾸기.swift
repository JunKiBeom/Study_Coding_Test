import Foundation

func solution(_ my_string:String, _ num1:Int, _ num2:Int) -> String {
    var answer = Array(my_string)
    var tmp = answer[num1]
    answer[num1] = answer[num2]
    answer[num2] = tmp
    return String(answer)
}