<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <base href="<%=basePath%>"/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>后台管理系统</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

    <!-- CORE CSS-->
    <link rel="stylesheet" href="assets/bootstrap/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="assets/adminlte/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="assets/adminlte/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="assets/adminlte/AdminLTE.min.css">
    <link rel="stylesheet" href="assets/adminlte/_all-skins.min.css">
    <link rel="stylesheet" href="assets/adminlte/style.css">
    <link rel="stylesheet" href="assets/datatable/dataTables.bootstrap.min.css">
    <link rel="stylesheet" href="assets/datepicker/datepicker3.css">
    <link rel="stylesheet" type="text/css" href="assets/select2/css/select2.min.css">
</head>

<body class="skin-blue fixed" data-spy="scroll" data-target="#scrollspy">

    <jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="sidebar.jsp"></jsp:include>
    
    <div class="mainContent">

    </div>
    
    <!-- CORE js -->
    <script type="text/javascript" src="assets/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="assets/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/adminlte/app.min.js"></script>
    <script type="text/javascript" src="assets/adminlte/jquery.slimscroll.min.js"></script>
    
    <script type="text/javascript" src="assets/datatable/jquery.dataTables.js"></script>
    <script type="text/javascript" src="assets/datatable/dataTables.bootstrap.min.js"></script>
    
    <script type="text/javascript" src="assets/datepicker/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="assets/datepicker/bootstrap-datepicker.zh-CN.js"></script>

    <script type="text/javascript" src="assets/select2/js/select2.min.js"></script>
    
    <!--<script type="text/javascript" src="assets/fingerprint/fingerprint.js"></script>-->

    <!-- util -->
    <script type="text/javascript" src="assets/custom/util/time.js"></script>
    <script type="text/javascript" src="assets/custom/util/navigate.js"></script>
    
    <!-- page -->
    <script type="text/javascript" src="assets/custom/home/sidebar_goto.js"></script>
    <script type="text/javascript" src="assets/custom/home/header.js"></script>
    <script type="text/javascript" src="assets/custom/home/home.js"></script>


</body>
</html>