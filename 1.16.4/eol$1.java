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
/*    */ class null
/*    */   extends Thread
/*    */ {
/*    */   null(eol ☃, String str1, String paramString1, int paramInt, djz paramdjz, dgq paramdgq) {
/* 36 */     super(str1);
/*    */   }
/*    */   public void run() {
/* 39 */     InetAddress ☃ = null;
/*    */     try {
/* 41 */       ☃ = InetAddress.getByName(this.a);
/*    */       
/* 43 */       if (eol.a(this.e)) {
/*    */         return;
/*    */       }
/*    */       
/* 47 */       eol.a(this.e, nd.a(☃, this.b, this.c.k.f()));
/*    */       
/* 49 */       if (eol.a(this.e)) {
/*    */         return;
/*    */       }
/*    */       
/* 53 */       eol.b(this.e).a(new dws(eol.b(this.e), this.c, eol.c(this.e), ☃ -> {
/*    */             
/* 55 */             })); if (eol.a(this.e)) {
/*    */         return;
/*    */       }
/*    */       
/* 59 */       eol.b(this.e).a(new tv(this.a, this.b, ne.d));
/*    */       
/* 61 */       if (eol.a(this.e)) {
/*    */         return;
/*    */       }
/*    */       
/* 65 */       eol.b(this.e).a(new ug(this.c.J().e()));
/* 66 */       this.c.a(this.d.d(this.a));
/* 67 */     } catch (UnknownHostException unknownHostException) {
/* 68 */       this.c.P().b();
/*    */       
/* 70 */       if (eol.a(this.e)) {
/*    */         return;
/*    */       }
/*    */       
/* 74 */       eol.c().error("Couldn't connect to world", unknownHostException);
/* 75 */       eoi eoi = new eoi(eol.c(this.e), nq.i, new of("disconnect.genericReason", new Object[] { "Unknown host '" + this.a + "'" }));
/* 76 */       this.c.execute(() -> ☃.a(eoi1));
/* 77 */     } catch (Exception exception) {
/* 78 */       this.c.P().b();
/*    */       
/* 80 */       if (eol.a(this.e)) {
/*    */         return;
/*    */       }
/*    */       
/* 84 */       eol.c().error("Couldn't connect to world", exception);
/* 85 */       String str = exception.toString();
/*    */       
/* 87 */       if (☃ != null) {
/* 88 */         String str1 = ☃ + ":" + this.b;
/* 89 */         str = str.replaceAll(str1, "");
/*    */       } 
/*    */       
/* 92 */       eoi eoi = new eoi(eol.c(this.e), nq.i, new of("disconnect.genericReason", new Object[] { str }));
/* 93 */       this.c.execute(() -> ☃.a(eoi1));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eol$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */