/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.SocketAddress;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends Thread
/*     */ {
/*     */   null(aba ☃, String str1, String paramString1) {
/* 164 */     super(str1);
/*     */   }
/*     */   public void run() {
/* 167 */     GameProfile ☃ = aba.a(this.b);
/*     */     try {
/* 169 */       aba.a(this.b, aba.b(this.b).ap().hasJoinedServer(new GameProfile(null, ☃.getName()), this.a, a()));
/*     */       
/* 171 */       if (aba.a(this.b) != null) {
/* 172 */         aba.e().info("UUID of player {} is {}", aba.a(this.b).getName(), aba.a(this.b).getId());
/* 173 */         aba.a(this.b, aba.a.e);
/* 174 */       } else if (aba.b(this.b).O()) {
/* 175 */         aba.e().warn("Failed to verify username but will let them in anyway!");
/* 176 */         aba.a(this.b, this.b.a(☃));
/* 177 */         aba.a(this.b, aba.a.e);
/*     */       } else {
/* 179 */         this.b.b(new of("multiplayer.disconnect.unverified_username"));
/* 180 */         aba.e().error("Username '{}' tried to join with an invalid session", ☃.getName());
/*     */       } 
/* 182 */     } catch (AuthenticationUnavailableException authenticationUnavailableException) {
/* 183 */       if (aba.b(this.b).O()) {
/* 184 */         aba.e().warn("Authentication servers are down but will let them in anyway!");
/* 185 */         aba.a(this.b, this.b.a(☃));
/* 186 */         aba.a(this.b, aba.a.e);
/*     */       } else {
/* 188 */         this.b.b(new of("multiplayer.disconnect.authservers_down"));
/* 189 */         aba.e().error("Couldn't verify username because servers are unavailable");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private InetAddress a() {
/* 196 */     SocketAddress ☃ = this.b.a.c();
/* 197 */     return (aba.b(this.b).W() && ☃ instanceof InetSocketAddress) ? ((InetSocketAddress)☃).getAddress() : null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aba$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */