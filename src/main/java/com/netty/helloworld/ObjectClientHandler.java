package com.netty.helloworld;//import org.jboss.netty.channel.Channel;
//import org.jboss.netty.channel.ChannelHandlerContext;
//import org.jboss.netty.channel.ChannelStateEvent;
//import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * Created by admin on 2017/10/20.
 */
public class ObjectClientHandler {

//    /**
//     * 当绑定到服务端的时候触发，给服务端发消息。
//     *
//     * @author lihzh
//     * @alia OneCoder
//     */
//    @Override
//    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
//        // 向服务端发送Object信息
//        sendObject(e.getChannel());
//    }
//
//    /**
//     * 发送Object
//     *
//     * @param channel
//     * @author lihzh
//     * @alia OneCoder
//     */
//    private void sendObject(Channel channel) {
//        com.netty.helloworld.Command command = new com.netty.helloworld.Command();
//        command.setActionName("Hello action.");
//        channel.write(command);
//    }
}