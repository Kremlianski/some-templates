import * as React from "react";

interface HelloProps {
  name: string;
}

class Hello extends React.Component<HelloProps, {}> {
  render() {
    return <div>Hello my friend, {this.props.name}</div>;
  }
}

export default Hello;