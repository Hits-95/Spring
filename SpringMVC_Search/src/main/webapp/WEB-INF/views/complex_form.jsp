<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="link.jsp"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Complex-Form</title>
</head>

<body class="bg-secondary bg-gradient ">
  <div class="container">

    <div class="card mx-auto mt-5 border border-info border border-4" style="width: 40%;">
      <div class="card-body bg-light">
        <h4 class="card-title text-center text-primary "><strong>Complex Form</strong></h4>
        <hr>

        <form action="handleform" method="post">
          <div class="mb-3">
            <label for="name" class="form-label text-dark"> <strong>Your Name</strong> </label>
            <input type="text" name="name" class="form-control" placeholder="Enter your name">
          </div>

          <div class="mb-3">
            <label for="name" class="form-label "> <strong>Your Id</strong></label>
            <input type="text" name="id" class="form-control" placeholder="Enter your Id">
          </div>

          <div class="mb-3">
            <label for="name" class="form-label "><strong>Date-of-Birth</strong></label>
            <input type="text" name="bdate" class="form-control" placeholder="dd/mm/yyyy">
          </div>

          <div class="mb-3">
            <label for="name" class="form-label"><strong>Course</strong> </label>
           
            <select class="form-select" name="course" multiple aria-label="multiple select example">
                  <option>Java</option>
              <option>Python</option>
              <option>Nodejs</option>
              <option>C++</option>
              <option>Php</option>
              <option>JavaScript</option>
              <option>C</option>
            </select>
          </div>

          <div class="mb-3">
            <label for="name" class="form-label"><strong>Select Gender : </strong> </label>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male">
              <label class="form-check-label" for="inlineRadio1">Male</label>
            </div>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female">
              <label class="form-check-label" for="inlineRadio2">Female</label>
            </div>
          </div>

          <div class="mb-3">
            <label class="form-check-label " for="inlineRadio2"><strong>Select Type</strong></label>
            <select class="form-select" name="type">
              <option>Old Student</option>
              <option>Normal Student</option>
            </select>
          </div>

          <div class="container text-center py-2">
            <button type="submit" class="btn btn-primary">Submit</button>
          </div>
        </form>

      </div>
    </div>

  </div>

</body>
</html>