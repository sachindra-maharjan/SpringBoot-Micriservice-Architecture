#!/bin/sh

host="$1"
shift
cmd="$@"

until curl --output /dev/null --silent --head --fail http://$host; do
    >&2 echo "Service http://$host is unavailable - sleeping for 2 seconds"
    sleep 2
done

>&2 echo "Service is up - executing command"
exec $cmd