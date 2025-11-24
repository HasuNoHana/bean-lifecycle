curl -X POST http://localhost:8080/v1/products/createProduct \
  -H "Content-Type: application/json" \
  -d '{"productName": "Iron", "otherData": "Iron Picture"}'
