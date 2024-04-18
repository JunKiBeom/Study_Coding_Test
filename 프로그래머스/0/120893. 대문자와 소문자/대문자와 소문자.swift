import Foundation

func solution(_ my_string:String) -> String {
    var result = ""
    
    for c in my_string {
            result += String(c) == c.lowercased() ? c.uppercased() : c.lowercased()
        }
    return result
}