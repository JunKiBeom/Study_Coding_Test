import Foundation

let a = readLine()?.split(separator: " ").map{Int($0)!}

var sol = Int(a![0]) * Int(a![1])

print(sol)
