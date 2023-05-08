async function registrar() {
    let datos = {};
  
    datos.nombre = document.getElementById("nombre").value;
    const request = await fetch("/api/registro/categoria/post", {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
      body: JSON.stringify(datos),
    });
  
    const response = await request.text();
    if (response !="FAIL") {
      
      window.location.href = "crear_producto";
    } else {
      alert("ESE CORREO EXISTE, INGRESE OTRO POR FAVOR");
    }
  }
  