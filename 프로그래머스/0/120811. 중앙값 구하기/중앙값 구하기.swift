import Foundation

func solution(_ array:[Int]) -> Int {
    var tmp = array.sorted()
    return tmp[tmp.count/2]
}