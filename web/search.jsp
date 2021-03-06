    <html>
        <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.8.1/bootstrap-table.min.css">
        <link rel="stylesheet" href="css/aaa.css">
        </head>

        <body>

        <div class="jumbotron">
        <div class="container">
        <h1>Hello, ${name}! (${email})</h1>
        <p>Nice to meet you :-)</p>
        </div>
        </div>
        <div class="container">

        <table data-url="json/db.json" data-show-refresh="true"
        data-show-toggle="true" data-search="true" data-filter-control="true" data-toggle="table" data-show-columns="true" data-mobile-responsive="true" data-check-on-init="true" class="tab_unit table table-striped">
        <thead>
        <tr>
        <th data-field="genre" data-filter-control="input"  data-sortable="true">Genre</th>
        <th data-filter-control="input" data-field="author" data-sortable="true">Author</th>
        <th data-filter-control="input" data-field="title" data-sortable="true">Title</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
        </table>
        </div>

        <script src="http://code.jquery.com/jquery-2.1.4.min.js" type="text/javascript"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="js/bootstrap-table-master/src/bootstrap-table.js"></script>
        <script src="js/bootstrap-table-master/src/extensions/filter-control/bootstrap-table-filter-control.js"></script>
        </body>

        </html>