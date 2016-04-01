<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<aside id="left-sidebar-nav">
	<ul id="slide-out"
		class="side-nav fixed leftside-navigation ps-container ps-active-y"
		style="width: 240px;">
		<li class="user-details white darken-2">
			<div class="row">
				<div class="col col s4 m4 l4">
					<img src="assets/materialize/img/avatar.jpg" alt=""
						class="circle responsive-img valign profile-image">
				</div>
				<div class="col col s8 m8 l8">
					<a
						class="btn-flat dropdown-button waves-effect waves-light black-text profile-btn"
						href="javascript:void(0);" data-activates="profile-dropdown">Ruxia<i
						class="mdi-navigation-arrow-drop-down right"></i></a>
					<ul id="profile-dropdown" class="dropdown-content"
						style="width: 128px; position: absolute; top: 57px; left: 101.234px; opacity: 1; display: none;">
						<li><a href="javascript:void(0);"><i class="mdi-action-face-unlock"></i>
								简介</a></li>
						<li><a href="javascript:void(0);"><i class="mdi-action-settings"></i>
								设置</a></li>
						<li><a href="javascript:void(0);"><i class="mdi-communication-live-help"></i>
								帮助</a></li>
						<li class="divider"></li>
						<li><a href="javascript:void(0);"><i class="mdi-hardware-keyboard-tab"></i>
								退出</a></li>
					</ul>
					<p class="user-roal">管理员</p>
				</div>
			</div>
		</li>
		<li class="li-hover"><div class="divider"></div></li>
		<li class="bold"><a href="javascript:void(0);"
			class="waves-effect waves-cyan"><i class="mdi-action-dashboard"></i>
				主面板</a></li>
		<li class="bold"><a href="javascript:void(0);"
			class="waves-effect waves-cyan"><i
				class="mdi-communication-email"></i> 消息中心 <span class="new badge">4</span></a>
		</li>
		<li class="no-padding">
			<ul class="collapsible collapsible-accordion">
				<li class="bold"><a
					class="collapsible-header waves-effect waves-cyan"><i
						class="mdi-action-invert-colors"></i> 问卷管理</a>
					<div class="collapsible-body" style="">
						<ul>
							<li><a href="javascript:void(0);">问卷模板管理</a></li>
							<li><a href="javascript:void(0);">问卷审核</a></li>
							<li><a href="javascript:void(0);">问卷检索</a></li>
						</ul>
					</div>
				</li>
			</ul>
		</li>
	</ul>
	<a href="#" data-activates="slide-out"
		class="sidebar-collapse btn-floating btn-medium waves-effect waves-light hide-on-large-only darken-2"><i
		class="mdi-navigation-menu"></i></a>
</aside>