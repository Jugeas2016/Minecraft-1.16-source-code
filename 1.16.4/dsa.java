/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.minecraft.SocialInteractionsService;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dsa
/*    */ {
/*    */   private final djz a;
/* 18 */   private final Set<UUID> b = Sets.newHashSet();
/*    */   private final SocialInteractionsService c;
/* 20 */   private final Map<String, UUID> d = Maps.newHashMap();
/*    */   
/*    */   public dsa(djz ☃, SocialInteractionsService socialInteractionsService) {
/* 23 */     this.a = ☃;
/* 24 */     this.c = socialInteractionsService;
/*    */   }
/*    */   
/*    */   public void a(UUID ☃) {
/* 28 */     this.b.add(☃);
/*    */   }
/*    */   
/*    */   public void b(UUID ☃) {
/* 32 */     this.b.remove(☃);
/*    */   }
/*    */   
/*    */   public boolean c(UUID ☃) {
/* 36 */     return (d(☃) || e(☃));
/*    */   }
/*    */   
/*    */   public boolean d(UUID ☃) {
/* 40 */     return this.b.contains(☃);
/*    */   }
/*    */   
/*    */   public boolean e(UUID ☃) {
/* 44 */     return this.c.isBlockedPlayer(☃);
/*    */   }
/*    */   
/*    */   public Set<UUID> a() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public UUID a(String ☃) {
/* 52 */     return this.d.getOrDefault(☃, x.b);
/*    */   }
/*    */   
/*    */   public void a(dwx ☃) {
/* 56 */     GameProfile gameProfile = ☃.a();
/* 57 */     if (gameProfile.isComplete()) {
/* 58 */       this.d.put(gameProfile.getName(), gameProfile.getId());
/*    */     }
/*    */     
/* 61 */     dot dot = this.a.y;
/* 62 */     if (dot instanceof dsc) {
/* 63 */       dsc dsc = (dsc)dot;
/* 64 */       dsc.a(☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void f(UUID ☃) {
/* 69 */     dot dot = this.a.y;
/* 70 */     if (dot instanceof dsc) {
/* 71 */       dsc dsc = (dsc)dot;
/* 72 */       dsc.a(☃);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */