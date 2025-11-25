curl -X GET http://localhost:8080/student/students \
  -H "Content-Type: application/json" \
  -d '{"numberOfStudents": "20", "indexLength": "10"}'
