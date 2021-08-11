/*    */ import java.net.InetAddress;
/*    */ import java.net.UnknownHostException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends Thread
/*    */ {
/*    */   null(dnt ☃, String str1, String paramString1, int paramInt) {
/* 58 */     super(str1);
/*    */   }
/*    */   public void run() {
/* 61 */     InetAddress ☃ = null;
/*    */     try {
/* 63 */       if (dnt.a(this.c)) {
/*    */         return;
/*    */       }
/* 66 */       ☃ = InetAddress.getByName(this.a);
/* 67 */       dnt.a(this.c, nd.a(☃, this.b, this.c.i.k.f()));
/* 68 */       dnt.b(this.c).a(new dws(dnt.b(this.c), this.c.i, dnt.c(this.c), nr1 -> dnt.a(☃, nr1)));
/* 69 */       dnt.b(this.c).a(new tv(this.a, this.b, ne.d));
/* 70 */       dnt.b(this.c).a(new ug(this.c.i.J().e()));
/* 71 */     } catch (UnknownHostException unknownHostException) {
/* 72 */       if (dnt.a(this.c)) {
/*    */         return;
/*    */       }
/* 75 */       dnt.g().error("Couldn't connect to server", unknownHostException);
/* 76 */       this.c.i.execute(() -> this.c.i.a(new doa(dnt.c(this.c), nq.i, new of("disconnect.genericReason", new Object[] { "Unknown host" }))));
/* 77 */     } catch (Exception exception) {
/* 78 */       if (dnt.a(this.c)) {
/*    */         return;
/*    */       }
/* 81 */       dnt.g().error("Couldn't connect to server", exception);
/* 82 */       String str = (☃ == null) ? exception.toString() : exception.toString().replaceAll(☃ + ":" + this.b, "");
/* 83 */       this.c.i.execute(() -> this.c.i.a(new doa(dnt.c(this.c), nq.i, new of("disconnect.genericReason", new Object[] { ☃ }))));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnt$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */