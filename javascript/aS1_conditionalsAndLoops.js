// The Snail in the Well


// The snail climbs up 7 feet each day and slips back 2 feet each night.
// How many days will it take the snail to get out of a well with the given depth?

// Sample Input:
// 31

// Sample Output:
// 6

// Explanation: Let's break down the distance the snail covers each day:
// Day 1: 7-2=5
// Day 2: 5+7-2=10
// Day 3: 10+7-2=15
// Day 4: 15+7-2=20
// Day 5: 20+7-2=25
// Day 6: 25+7=32
// So, on Day 6 the snail will reach 32 feet and get out of the well at day, without slipping back that night.

function main(){
    var depth = parseInt(readLine(), 10);
    //your code goes here
    var distanceClimbed=0;
    var daysTaken=0;

    while(distanceClimbed<depth){
        distanceClimbed=distanceClimbed+7;
        if(distanceClimbed>=depth){
            daysTaken++;
            break;
        }
        distanceClimbed=distanceClimbed-2;
        daysTaken++;
    }
    console.log(daysTaken);
}
