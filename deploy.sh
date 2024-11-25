cf cs credhub default chtestservice -c '{"foo":"bar"}'
cf push chtest --no-start
cf bs chtest chtestservice
cf start chtest
