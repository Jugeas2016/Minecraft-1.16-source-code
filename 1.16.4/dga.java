/*    */ import com.google.common.collect.Lists;
/*    */ import java.net.InetSocketAddress;
/*    */ import java.net.Socket;
/*    */ import java.net.SocketAddress;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dga
/*    */ {
/*    */   public static List<dgz> a(a... ☃) {
/* 16 */     for (a a1 : ☃) {
/* 17 */       a(a.a(a1));
/*    */     }
/*    */ 
/*    */     
/* 21 */     List<dgz> list = Lists.newArrayList();
/* 22 */     for (a a1 : ☃) {
/* 23 */       list.add(new dgz(a.b(a1), a(a.a(a1))));
/*    */     }
/*    */ 
/*    */     
/* 27 */     list.sort(Comparator.comparingInt(dgz::a));
/* 28 */     return list;
/*    */   }
/*    */   
/*    */   private static int a(String ☃) {
/* 32 */     int i = 700;
/* 33 */     long l = 0L;
/* 34 */     Socket socket = null;
/* 35 */     for (int j = 0; j < 5; j++) {
/*    */       
/* 37 */       try { SocketAddress socketAddress = new InetSocketAddress(☃, 80);
/* 38 */         socket = new Socket();
/* 39 */         long l1 = b();
/* 40 */         socket.connect(socketAddress, 700);
/* 41 */         l += b() - l1;
/*    */ 
/*    */ 
/*    */         
/* 45 */         a(socket); } catch (Exception exception) { l += 700L; } finally { a(socket); }
/*    */     
/*    */     } 
/* 48 */     return (int)(l / 5.0D);
/*    */   }
/*    */   
/*    */   private static void a(Socket ☃) {
/*    */     try {
/* 53 */       if (☃ != null) {
/* 54 */         ☃.close();
/*    */       }
/* 56 */     } catch (Throwable throwable) {}
/*    */   }
/*    */ 
/*    */   
/*    */   private static long b() {
/* 61 */     return x.b();
/*    */   }
/*    */   
/*    */   public static List<dgz> a() {
/* 65 */     return a(a.values());
/*    */   }
/*    */   
/*    */   enum a {
/* 69 */     a("us-east-1", "ec2.us-east-1.amazonaws.com"),
/* 70 */     b("us-west-2", "ec2.us-west-2.amazonaws.com"),
/* 71 */     c("us-west-1", "ec2.us-west-1.amazonaws.com"),
/* 72 */     d("eu-west-1", "ec2.eu-west-1.amazonaws.com"),
/* 73 */     e("ap-southeast-1", "ec2.ap-southeast-1.amazonaws.com"),
/* 74 */     f("ap-southeast-2", "ec2.ap-southeast-2.amazonaws.com"),
/* 75 */     g("ap-northeast-1", "ec2.ap-northeast-1.amazonaws.com"),
/* 76 */     h("sa-east-1", "ec2.sa-east-1.amazonaws.com"); private final String i; private final String j;
/*    */     
/*    */     a(String ☃, String str1) {
/* 79 */       this.i = ☃;
/* 80 */       this.j = str1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */