function sumDouble(x,y) {
    if(x === y){
        return 2 * (x + y);
    }else {
        return x + y;
    }

}
function hasTeen(a, b, c) {
    var a, b, c;
    
    if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
        return true;
    } else {
        return false;
    }
}
function lastDigit(num1, num2) {
    num1 = num1.toString();
    num2 = num2.toString();
    if( (num1.charAt(num1.length - 1)) == (num2.charAt(num2.length - 1))) {
        return true;
    } else {
        return false;
    }
}
function seeColor(a) {
    var a;
    if (a.substring(0, 3) == 'red') {
        return "red";
    } else if (a.substring(0, 4) == 'blue') {
        return "blue";
    } else {
        return "";
    }
}
function middleThree(a) {
    var a;
    var b;
    if (a.length == 3) {
        return a;
    } else {
        b = Math.round(a.length / 2);
        a = a.substring(b - 2, b + 1);
        return a;
    }
}
function frontAgain(a) {
    var a;
    var b;
    if (a.length == 2) {
        return true;
    } else {
       b = a.substring(0, 2);
       if ( b == a.substring(a.length - 2, a.length)) {
           return true;
       } else {
           return false;
       }
    }
}
function alarmClock(day, isVac) {
    var day;
    var isVac;

    if (isVac == false && (day != 6 && day != 0)) {
        return "7:00";
    }
    else if (isVac == false && (day == 6 || day == 0)) {
        return "10:00";
    }  
    else if (isVac == true && (day != 6 && day != 0)) {
       return "10:00";
    }
    else {
        return "off";
    }
       
}
function makeMiddle (newArray) {
   
}