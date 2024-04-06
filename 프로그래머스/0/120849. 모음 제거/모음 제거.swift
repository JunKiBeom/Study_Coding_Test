import Foundation

func solution(_ my_string:String) -> String {
    var arr = ["a","e","i","o","u"]
    var str = my_string
    for i in arr {
        str = str.replacingOccurrences(of: i, with: "")
    }
    return str
}