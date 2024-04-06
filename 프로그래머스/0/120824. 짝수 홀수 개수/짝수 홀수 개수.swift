import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    var tmp = num_list.filter({ $0 % 2 != 0 }).count
    return [num_list.count - tmp, tmp]
}