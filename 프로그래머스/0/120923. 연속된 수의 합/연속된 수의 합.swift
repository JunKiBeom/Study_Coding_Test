import Foundation

func solution(_ num:Int, _ total:Int) -> [Int] {
    var answer : [Int] = []
    var start = 0
    
    if (num % 2 == 0){
        start = (total + (num / 2)) / num - num / 2
    }
    else{
        start = total / num - (num / 2)
    }

    for i in 0..<num {
        answer.append(start)
        start += 1
        
    }
    return answer
}