<!DOCTYPE html>
<html>
<head>
    <title>Payment Page</title>
</head>
<body>
    <h2>Payment for Policy ID: ${policy.id}</h2>
    <p>Owner: ${policy.ownerName}</p>
    <p>Amount to Pay: ${policy.totalPremium}</p>

    <h3>Scan this QR Code to Pay</h3>
    <img src="https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=upi://pay?pa=your-upi-id@upi&am=${policy.totalPremium}&cu=INR" alt="QR Code">

    <form action="/payment/success" method="post">
        <button type="submit">I have Paid</button>
    </form>
</body>
</html>
