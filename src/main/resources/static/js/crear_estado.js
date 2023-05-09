async function registrar() {
    let datos = {};
  
    datos.estado = document.getElementById("estado").value;
    const request = await fetch("/api/registro/estado/post", {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
      body: JSON.stringify(datos),
    });
  
    const response = await request.text();
    if (response !="FAIL") {
      
      window.location.href = "producto";
    } else {
      alert("ESE CORREO EXISTE, INGRESE OTRO POR FAVOR");
    }
  }