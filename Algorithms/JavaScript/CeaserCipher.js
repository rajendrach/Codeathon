function rot13(encodedStr) {
  var codeArr = encodedStr.split("");  // String to Array
  var decodedArr = []; // Your Result goes here
  // Only change code below this line
  var alpha = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
  var length = codeArr.length;
  for(var i=0; i<length;i++){
    var index = alpha.indexOf(codeArr[i]);
    if(index>=0){
    index = index + 13;
    if(index>25){
      index = index -26;
    }
    decodedArr[i] = alpha[index];
    }else{
        decodedArr[i] = codeArr[i];
    }
    
  }
  
  // Only change code above this line
  return decodedArr.join(""); // Array to String
}

// Change the inputs below to test
rot13("SERR PBQR PNZC");
rot13("SERR CVMMN!");
//rot13("SERR YBIR?");
//rot13("GUR DHVPX OEBJA QBT WHZCRQ BIRE GUR YNML SBK.");
