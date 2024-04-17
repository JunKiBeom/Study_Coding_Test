import Foundation

func solution(_ num_list:[Int]) -> Int {
    let even = num_list.filter {$0 % 2 == 0}.map {String($0)}.joined()
    let odd = num_list.filter {$0 % 2 != 0}.map {String($0)}.joined()
    
    return Int(even)! + Int(odd)!
}