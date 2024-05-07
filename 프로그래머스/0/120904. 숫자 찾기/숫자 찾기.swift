import Foundation

func solution(_ num:Int, _ k:Int) -> Int {
    let nums = String(num).map{ Int(String($0))! }
//    let idx: Int = nums.distance(from: nums.startIndex, to: i)
    return (nums.firstIndex(of: k) ?? -2) + 1
}