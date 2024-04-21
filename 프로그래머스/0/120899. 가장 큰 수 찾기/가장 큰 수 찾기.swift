import Foundation

func solution(_ array:[Int]) -> [Int] {
    var m = array.max()!
    var i = array.firstIndex(of: m)!
    return [m, i]
}