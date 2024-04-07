import Foundation

func solution(_ n:Int) -> Int {
    let ans = Int(sqrt(Double(n)))
    return ans*ans==n ? 1 : 2
}