# wait-for-it.sh
#!/bin/bash

host="$1"
shift
cmd="$@"

until curl --output /dev/null --silent --head --fail http://$host; do
    >&2 echo "Service is unavailable - sleeping"
    sleep 1
done

>&2 echo "Service is up - executing command"
exec $cmd