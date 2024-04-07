import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    var result = ""
    for i in my_string{
        result.append(String(repeating: i, count: n))
    }
    return result
}