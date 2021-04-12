<%@include file="link.jsp"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Upload-img</title>
</head>
<body>
	<div class="container p-4">

		<h1 class="text-center p-3">Upload Form</h1>

		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<form action="uploadimage" method="post"
					enctype="multipart/form-data">
					<div class="input-group ">
						<label class="input-group-text" for="inputGroupFile01">Select
							your image</label> <input type="file" name="profile" class="form-control"
							id="inputGroupFile01">
					</div>
					<br>
					<div class="text-center">
						<button class=" btn btn-outline-success">Upload</button>
					</div>

				</form>
			</div>
		</div>
		<div class="col-sm-3"></div>
	</div>
</body>
</html>