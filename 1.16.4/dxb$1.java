/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */   implements uk
/*     */ {
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private long g;
/*     */   
/*     */   null(dxb ☃, nd paramnd, dwz paramdwz, Runnable paramRunnable) {}
/*     */   
/*     */   public void a(um ☃) {
/*  69 */     if (this.f) {
/*  70 */       this.a.a(new of("multiplayer.status.unrequested"));
/*     */       return;
/*     */     } 
/*  73 */     this.f = true;
/*  74 */     un un = ☃.b();
/*     */     
/*  76 */     if (un.a() != null) {
/*  77 */       this.b.d = un.a();
/*     */     } else {
/*  79 */       this.b.d = oe.d;
/*     */     } 
/*     */     
/*  82 */     if (un.c() != null) {
/*  83 */       this.b.g = new oe(un.c().a());
/*  84 */       this.b.f = un.c().b();
/*     */     } else {
/*  86 */       this.b.g = new of("multiplayer.status.old");
/*  87 */       this.b.f = 0;
/*     */     } 
/*     */     
/*  90 */     if (un.b() != null) {
/*  91 */       this.b.c = dxb.a(un.b().b(), un.b().a());
/*     */       
/*  93 */       List<nr> list = Lists.newArrayList();
/*  94 */       if (ArrayUtils.isNotEmpty((Object[])un.b().c())) {
/*  95 */         for (GameProfile gameProfile : un.b().c()) {
/*  96 */           list.add(new oe(gameProfile.getName()));
/*     */         }
/*  98 */         if ((un.b().c()).length < un.b().b()) {
/*  99 */           list.add(new of("multiplayer.status.and_more", new Object[] { Integer.valueOf(un.b().b() - (un.b().c()).length) }));
/*     */         }
/* 101 */         this.b.i = list;
/*     */       } 
/*     */     } else {
/* 104 */       this.b.c = (new of("multiplayer.status.unknown")).a(k.i);
/*     */     } 
/*     */     
/* 107 */     String str = null;
/* 108 */     if (un.d() != null) {
/* 109 */       String str1 = un.d();
/* 110 */       if (str1.startsWith("data:image/png;base64,")) {
/* 111 */         str = str1.substring("data:image/png;base64,".length());
/*     */       } else {
/* 113 */         dxb.c().error("Invalid server icon (unknown format)");
/*     */       } 
/*     */     } 
/* 116 */     if (!Objects.equals(str, this.b.c())) {
/* 117 */       this.b.a(str);
/* 118 */       this.c.run();
/*     */     } 
/*     */     
/* 121 */     this.g = x.b();
/* 122 */     this.a.a(new up(this.g));
/* 123 */     this.e = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ul ☃) {
/* 128 */     long l1 = this.g;
/* 129 */     long l2 = x.b();
/* 130 */     this.b.e = l2 - l1;
/*     */     
/* 132 */     this.a.a(new of("multiplayer.status.finished"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nr ☃) {
/* 137 */     if (!this.e) {
/* 138 */       dxb.c().error("Can't ping {}: {}", this.b.b, ☃.getString());
/* 139 */       this.b.d = (new of("multiplayer.status.cannot_connect")).a(k.e);
/* 140 */       this.b.c = oe.d;
/*     */       
/* 142 */       dxb.a(this.d, this.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public nd a() {
/* 148 */     return this.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxb$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */