<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JAPP</title>
    <script src="/js/index.js" defer></script>
</head>

<body>
    <h1>Products</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Precio</th>
            </tr>
        </thead>
        <tbody>
        <#list productList as product>
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getName()}</td>
                <td>CRC ${product.getPrice()}</td>
            </tr>
        </#list>
        </tbody>        
    </table>
</body>

</html>
