var formfield = document.getElementById("formfield");

function add() {
    var newField = document.createElement("br");
    formfield.appendChild(newField);

    var newField = document.createElement("input");
    newField.setAttribute("type", "text");
    newField.setAttribute("name", "subjectName");
    newField.setAttribute("id", "subject_Name");
    newField.setAttribute("class", "text");
    newField.setAttribute("size", 50);
    newField.setAttribute("placeholder", "subject Name");
    newField.setAttribute("autocomplete", "off");
    formfield.appendChild(newField);
    
    var newField = document.createElement("input");
    newField.setAttribute("type", "number");
    newField.setAttribute("name", "subjectMarks");
    newField.setAttribute("id", "subject_Marks");
    newField.setAttribute("class", "text");
    newField.setAttribute("size", 50);
    newField.setAttribute("placeholder", "subject Marks");
    newField.setAttribute("step", "0.1");
    newField.setAttribute("min", "0");
    newField.setAttribute("max", "100");
    newField.setAttribute("autocomplete", "off");
    formfield.appendChild(newField);
}

function remove() {
  var input_tags = formfield.getElementsByTagName('input');
  var br_tags = formfield.getElementsByTagName('br');
  if(input_tags.length > 4) {
    formfield.removeChild(input_tags[(input_tags.length) - 1]);
    formfield.removeChild(input_tags[(input_tags.length) - 1]);
    formfield.removeChild(br_tags[(br_tags.length) - 1]);
  }
}
